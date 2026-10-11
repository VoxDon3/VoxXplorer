.class public final synthetic Lax/Z0/H;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/S0/t$a;


# instance fields
.field public final synthetic a:Lax/Z0/c$a;

.field public final synthetic b:I

.field public final synthetic c:Lax/P0/H$e;

.field public final synthetic d:Lax/P0/H$e;


# direct methods
.method public synthetic constructor <init>(Lax/Z0/c$a;ILax/P0/H$e;Lax/P0/H$e;)V
    .registers 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/Z0/H;->a:Lax/Z0/c$a;

    iput p2, p0, Lax/Z0/H;->b:I

    iput-object p3, p0, Lax/Z0/H;->c:Lax/P0/H$e;

    iput-object p4, p0, Lax/Z0/H;->d:Lax/P0/H$e;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/Z0/H;->a:Lax/Z0/c$a;

    iget v1, p0, Lax/Z0/H;->b:I

    iget-object v2, p0, Lax/Z0/H;->c:Lax/P0/H$e;

    iget-object v3, p0, Lax/Z0/H;->d:Lax/P0/H$e;

    check-cast p1, Lax/Z0/c;

    invoke-static {v0, v1, v2, v3, p1}, Lax/Z0/u0;->g1(Lax/Z0/c$a;ILax/P0/H$e;Lax/P0/H$e;Lax/Z0/c;)V

    return-void
.end method
