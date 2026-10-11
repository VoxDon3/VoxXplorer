.class public final synthetic Lax/Z0/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/S0/t$a;


# instance fields
.field public final synthetic a:Lax/Z0/c$a;

.field public final synthetic b:Lax/P0/v;

.field public final synthetic c:Lax/Y0/c;


# direct methods
.method public synthetic constructor <init>(Lax/Z0/c$a;Lax/P0/v;Lax/Y0/c;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/Z0/d0;->a:Lax/Z0/c$a;

    iput-object p2, p0, Lax/Z0/d0;->b:Lax/P0/v;

    iput-object p3, p0, Lax/Z0/d0;->c:Lax/Y0/c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/Z0/d0;->a:Lax/Z0/c$a;

    iget-object v1, p0, Lax/Z0/d0;->b:Lax/P0/v;

    iget-object v2, p0, Lax/Z0/d0;->c:Lax/Y0/c;

    check-cast p1, Lax/Z0/c;

    invoke-static {v0, v1, v2, p1}, Lax/Z0/u0;->n1(Lax/Z0/c$a;Lax/P0/v;Lax/Y0/c;Lax/Z0/c;)V

    return-void
.end method
