.class public final synthetic Lax/i1/L;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/S0/l;


# instance fields
.field public final synthetic a:Lax/i1/N$a;

.field public final synthetic b:Lax/i1/B;


# direct methods
.method public synthetic constructor <init>(Lax/i1/N$a;Lax/i1/B;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/i1/L;->a:Lax/i1/N$a;

    iput-object p2, p0, Lax/i1/L;->b:Lax/i1/B;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/i1/L;->a:Lax/i1/N$a;

    iget-object v1, p0, Lax/i1/L;->b:Lax/i1/B;

    check-cast p1, Lax/i1/N;

    invoke-static {v0, v1, p1}, Lax/i1/N$a;->e(Lax/i1/N$a;Lax/i1/B;Lax/i1/N;)V

    return-void
.end method
