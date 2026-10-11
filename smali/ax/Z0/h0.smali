.class public final synthetic Lax/Z0/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/S0/t$a;


# instance fields
.field public final synthetic a:Lax/Z0/c$a;

.field public final synthetic b:Lax/i1/y;

.field public final synthetic c:Lax/i1/B;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Lax/Z0/c$a;Lax/i1/y;Lax/i1/B;I)V
    .registers 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/Z0/h0;->a:Lax/Z0/c$a;

    iput-object p2, p0, Lax/Z0/h0;->b:Lax/i1/y;

    iput-object p3, p0, Lax/Z0/h0;->c:Lax/i1/B;

    iput p4, p0, Lax/Z0/h0;->d:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/Z0/h0;->a:Lax/Z0/c$a;

    iget-object v1, p0, Lax/Z0/h0;->b:Lax/i1/y;

    iget-object v2, p0, Lax/Z0/h0;->c:Lax/i1/B;

    iget v3, p0, Lax/Z0/h0;->d:I

    check-cast p1, Lax/Z0/c;

    invoke-static {v0, v1, v2, v3, p1}, Lax/Z0/u0;->H0(Lax/Z0/c$a;Lax/i1/y;Lax/i1/B;ILax/Z0/c;)V

    return-void
.end method
